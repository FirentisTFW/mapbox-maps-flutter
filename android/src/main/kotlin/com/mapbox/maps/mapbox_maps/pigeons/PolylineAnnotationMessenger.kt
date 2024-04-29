// Autogenerated from Pigeon (v18.0.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.mapbox.maps.mapbox_maps.pigeons

import android.util.Log
import io.flutter.plugin.common.BasicMessageChannel
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.MessageCodec
import io.flutter.plugin.common.StandardMessageCodec
import java.io.ByteArrayOutputStream
import java.nio.ByteBuffer

private fun wrapResult(result: Any?): List<Any?> {
  return listOf(result)
}

private fun wrapError(exception: Throwable): List<Any?> {
  if (exception is FlutterError) {
    return listOf(
      exception.code,
      exception.message,
      exception.details
    )
  } else {
    return listOf(
      exception.javaClass.simpleName,
      exception.toString(),
      "Cause: " + exception.cause + ", Stacktrace: " + Log.getStackTraceString(exception)
    )
  }
}

private fun createConnectionError(channelName: String): FlutterError {
  return FlutterError("channel-error", "Unable to establish connection on channel: '$channelName'.", "")
}

/** The display of line endings. */
enum class LineCap(val raw: Int) {
  /** A cap with a squared-off end which is drawn to the exact endpoint of the line. */
  BUTT(0),
  /** A cap with a rounded end which is drawn beyond the endpoint of the line at a radius of one-half of the line's width and centered on the endpoint of the line. */
  ROUND(1),
  /** A cap with a squared-off end which is drawn beyond the endpoint of the line at a distance of one-half of the line's width. */
  SQUARE(2);

  companion object {
    fun ofRaw(raw: Int): LineCap? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** The display of lines when joining. */
enum class LineJoin(val raw: Int) {
  /** A join with a squared-off end which is drawn beyond the endpoint of the line at a distance of one-half of the line's width. */
  BEVEL(0),
  /** A join with a rounded end which is drawn beyond the endpoint of the line at a radius of one-half of the line's width and centered on the endpoint of the line. */
  ROUND(1),
  /** A join with a sharp, angled corner which is drawn with the outer sides beyond the endpoint of the path until they meet. */
  MITER(2);

  companion object {
    fun ofRaw(raw: Int): LineJoin? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Controls the frame of reference for `line-translate`. */
enum class LineTranslateAnchor(val raw: Int) {
  /** The line is translated relative to the map. */
  MAP(0),
  /** The line is translated relative to the viewport. */
  VIEWPORT(1);

  companion object {
    fun ofRaw(raw: Int): LineTranslateAnchor? {
      return values().firstOrNull { it.raw == raw }
    }
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class PolylineAnnotation(
  /** The id for annotation */
  val id: String,
  /** The geometry that determines the location/shape of this annotation */
  val geometry: Map<String?, Any?>? = null,
  /** The display of lines when joining. */
  val lineJoin: LineJoin? = null,
  /** Sorts features in ascending order based on this value. Features with a higher sort key will appear above features with a lower sort key. */
  val lineSortKey: Double? = null,
  /** Blur applied to the line, in pixels. */
  val lineBlur: Double? = null,
  /** The color of the line border. If line-border-width is greater than zero and the alpha value of this color is 0 (default), the color for the border will be selected automatically based on the line color. */
  val lineBorderColor: Long? = null,
  /** The width of the line border. A value of zero means no border. */
  val lineBorderWidth: Double? = null,
  /** The color with which the line will be drawn. */
  val lineColor: Long? = null,
  /** Draws a line casing outside of a line's actual path. Value indicates the width of the inner gap. */
  val lineGapWidth: Double? = null,
  /** The line's offset. For linear features, a positive value offsets the line to the right, relative to the direction of the line, and a negative value to the left. For polygon features, a positive value results in an inset, and a negative value results in an outset. */
  val lineOffset: Double? = null,
  /** The opacity at which the line will be drawn. */
  val lineOpacity: Double? = null,
  /** Name of image in sprite to use for drawing image lines. For seamless patterns, image width must be a factor of two (2, 4, 8, ..., 512). Note that zoom-dependent expressions will be evaluated only at integer zoom levels. */
  val linePattern: String? = null,
  /** Stroke thickness. */
  val lineWidth: Double? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): PolylineAnnotation {
      val id = list[0] as String
      val geometry = list[1] as Map<String?, Any?>?
      val lineJoin = (list[2] as Int?)?.let {
        LineJoin.ofRaw(it)
      }
      val lineSortKey = list[3] as Double?
      val lineBlur = list[4] as Double?
      val lineBorderColor = list[5].let { if (it is Int) it.toLong() else it as Long? }
      val lineBorderWidth = list[6] as Double?
      val lineColor = list[7].let { if (it is Int) it.toLong() else it as Long? }
      val lineGapWidth = list[8] as Double?
      val lineOffset = list[9] as Double?
      val lineOpacity = list[10] as Double?
      val linePattern = list[11] as String?
      val lineWidth = list[12] as Double?
      return PolylineAnnotation(id, geometry, lineJoin, lineSortKey, lineBlur, lineBorderColor, lineBorderWidth, lineColor, lineGapWidth, lineOffset, lineOpacity, linePattern, lineWidth)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      id,
      geometry,
      lineJoin?.raw,
      lineSortKey,
      lineBlur,
      lineBorderColor,
      lineBorderWidth,
      lineColor,
      lineGapWidth,
      lineOffset,
      lineOpacity,
      linePattern,
      lineWidth,
    )
  }
}

/** Generated class from Pigeon that represents data sent in messages. */
data class PolylineAnnotationOptions(
  /** The geometry that determines the location/shape of this annotation */
  val geometry: Map<String?, Any?>? = null,
  /** The display of lines when joining. */
  val lineJoin: LineJoin? = null,
  /** Sorts features in ascending order based on this value. Features with a higher sort key will appear above features with a lower sort key. */
  val lineSortKey: Double? = null,
  /** Blur applied to the line, in pixels. */
  val lineBlur: Double? = null,
  /** The color of the line border. If line-border-width is greater than zero and the alpha value of this color is 0 (default), the color for the border will be selected automatically based on the line color. */
  val lineBorderColor: Long? = null,
  /** The width of the line border. A value of zero means no border. */
  val lineBorderWidth: Double? = null,
  /** The color with which the line will be drawn. */
  val lineColor: Long? = null,
  /** Draws a line casing outside of a line's actual path. Value indicates the width of the inner gap. */
  val lineGapWidth: Double? = null,
  /** The line's offset. For linear features, a positive value offsets the line to the right, relative to the direction of the line, and a negative value to the left. For polygon features, a positive value results in an inset, and a negative value results in an outset. */
  val lineOffset: Double? = null,
  /** The opacity at which the line will be drawn. */
  val lineOpacity: Double? = null,
  /** Name of image in sprite to use for drawing image lines. For seamless patterns, image width must be a factor of two (2, 4, 8, ..., 512). Note that zoom-dependent expressions will be evaluated only at integer zoom levels. */
  val linePattern: String? = null,
  /** Stroke thickness. */
  val lineWidth: Double? = null

) {
  companion object {
    @Suppress("UNCHECKED_CAST")
    fun fromList(list: List<Any?>): PolylineAnnotationOptions {
      val geometry = list[0] as Map<String?, Any?>?
      val lineJoin = (list[1] as Int?)?.let {
        LineJoin.ofRaw(it)
      }
      val lineSortKey = list[2] as Double?
      val lineBlur = list[3] as Double?
      val lineBorderColor = list[4].let { if (it is Int) it.toLong() else it as Long? }
      val lineBorderWidth = list[5] as Double?
      val lineColor = list[6].let { if (it is Int) it.toLong() else it as Long? }
      val lineGapWidth = list[7] as Double?
      val lineOffset = list[8] as Double?
      val lineOpacity = list[9] as Double?
      val linePattern = list[10] as String?
      val lineWidth = list[11] as Double?
      return PolylineAnnotationOptions(geometry, lineJoin, lineSortKey, lineBlur, lineBorderColor, lineBorderWidth, lineColor, lineGapWidth, lineOffset, lineOpacity, linePattern, lineWidth)
    }
  }
  fun toList(): List<Any?> {
    return listOf<Any?>(
      geometry,
      lineJoin?.raw,
      lineSortKey,
      lineBlur,
      lineBorderColor,
      lineBorderWidth,
      lineColor,
      lineGapWidth,
      lineOffset,
      lineOpacity,
      linePattern,
      lineWidth,
    )
  }
}
@Suppress("UNCHECKED_CAST")
private object OnPolylineAnnotationClickListenerCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PolylineAnnotation.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?) {
    when (value) {
      is PolylineAnnotation -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated class from Pigeon that represents Flutter messages that can be called from Kotlin. */
@Suppress("UNCHECKED_CAST")
class OnPolylineAnnotationClickListener(private val binaryMessenger: BinaryMessenger, private val messageChannelSuffix: String = "") {
  companion object {
    /** The codec used by OnPolylineAnnotationClickListener. */
    val codec: MessageCodec<Any?> by lazy {
      OnPolylineAnnotationClickListenerCodec
    }
  }
  fun onPolylineAnnotationClick(annotationArg: PolylineAnnotation, callback: (Result<Unit>) -> Unit) {
    val separatedMessageChannelSuffix = if (messageChannelSuffix.isNotEmpty()) ".$messageChannelSuffix" else ""
    val channelName = "dev.flutter.pigeon.mapbox_maps_flutter.OnPolylineAnnotationClickListener.onPolylineAnnotationClick$separatedMessageChannelSuffix"
    val channel = BasicMessageChannel<Any?>(binaryMessenger, channelName, codec)
    channel.send(listOf(annotationArg)) {
      if (it is List<*>) {
        if (it.size > 1) {
          callback(Result.failure(FlutterError(it[0] as String, it[1] as String, it[2] as String?)))
        } else {
          callback(Result.success(Unit))
        }
      } else {
        callback(Result.failure(createConnectionError(channelName)))
      }
    }
  }
}
@Suppress("UNCHECKED_CAST")
private object _PolylineAnnotationMessengerCodec : StandardMessageCodec() {
  override fun readValueOfType(type: Byte, buffer: ByteBuffer): Any? {
    return when (type) {
      128.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PolylineAnnotation.fromList(it)
        }
      }
      129.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PolylineAnnotation.fromList(it)
        }
      }
      130.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PolylineAnnotationOptions.fromList(it)
        }
      }
      131.toByte() -> {
        return (readValue(buffer) as? List<Any?>)?.let {
          PolylineAnnotationOptions.fromList(it)
        }
      }
      else -> super.readValueOfType(type, buffer)
    }
  }
  override fun writeValue(stream: ByteArrayOutputStream, value: Any?) {
    when (value) {
      is PolylineAnnotation -> {
        stream.write(128)
        writeValue(stream, value.toList())
      }
      is PolylineAnnotation -> {
        stream.write(129)
        writeValue(stream, value.toList())
      }
      is PolylineAnnotationOptions -> {
        stream.write(130)
        writeValue(stream, value.toList())
      }
      is PolylineAnnotationOptions -> {
        stream.write(131)
        writeValue(stream, value.toList())
      }
      else -> super.writeValue(stream, value)
    }
  }
}

/** Generated interface from Pigeon that represents a handler of messages from Flutter. */
interface _PolylineAnnotationMessenger {
  fun create(managerId: String, annotationOption: PolylineAnnotationOptions, callback: (Result<PolylineAnnotation>) -> Unit)
  fun createMulti(managerId: String, annotationOptions: List<PolylineAnnotationOptions>, callback: (Result<List<PolylineAnnotation>>) -> Unit)
  fun update(managerId: String, annotation: PolylineAnnotation, callback: (Result<Unit>) -> Unit)
  fun delete(managerId: String, annotation: PolylineAnnotation, callback: (Result<Unit>) -> Unit)
  fun deleteAll(managerId: String, callback: (Result<Unit>) -> Unit)
  fun setLineCap(managerId: String, lineCap: LineCap, callback: (Result<Unit>) -> Unit)
  fun getLineCap(managerId: String, callback: (Result<LineCap?>) -> Unit)
  fun setLineMiterLimit(managerId: String, lineMiterLimit: Double, callback: (Result<Unit>) -> Unit)
  fun getLineMiterLimit(managerId: String, callback: (Result<Double?>) -> Unit)
  fun setLineRoundLimit(managerId: String, lineRoundLimit: Double, callback: (Result<Unit>) -> Unit)
  fun getLineRoundLimit(managerId: String, callback: (Result<Double?>) -> Unit)
  fun setLineDasharray(managerId: String, lineDasharray: List<Double?>, callback: (Result<Unit>) -> Unit)
  fun getLineDasharray(managerId: String, callback: (Result<List<Double?>?>) -> Unit)
  fun setLineDepthOcclusionFactor(managerId: String, lineDepthOcclusionFactor: Double, callback: (Result<Unit>) -> Unit)
  fun getLineDepthOcclusionFactor(managerId: String, callback: (Result<Double?>) -> Unit)
  fun setLineEmissiveStrength(managerId: String, lineEmissiveStrength: Double, callback: (Result<Unit>) -> Unit)
  fun getLineEmissiveStrength(managerId: String, callback: (Result<Double?>) -> Unit)
  fun setLineTranslate(managerId: String, lineTranslate: List<Double?>, callback: (Result<Unit>) -> Unit)
  fun getLineTranslate(managerId: String, callback: (Result<List<Double?>?>) -> Unit)
  fun setLineTranslateAnchor(managerId: String, lineTranslateAnchor: LineTranslateAnchor, callback: (Result<Unit>) -> Unit)
  fun getLineTranslateAnchor(managerId: String, callback: (Result<LineTranslateAnchor?>) -> Unit)
  fun setLineTrimOffset(managerId: String, lineTrimOffset: List<Double?>, callback: (Result<Unit>) -> Unit)
  fun getLineTrimOffset(managerId: String, callback: (Result<List<Double?>?>) -> Unit)

  companion object {
    /** The codec used by _PolylineAnnotationMessenger. */
    val codec: MessageCodec<Any?> by lazy {
      _PolylineAnnotationMessengerCodec
    }
    /** Sets up an instance of `_PolylineAnnotationMessenger` to handle messages through the `binaryMessenger`. */
    @Suppress("UNCHECKED_CAST")
    fun setUp(binaryMessenger: BinaryMessenger, api: _PolylineAnnotationMessenger?, messageChannelSuffix: String = "") {
      val separatedMessageChannelSuffix = if (messageChannelSuffix.isNotEmpty()) ".$messageChannelSuffix" else ""
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.create$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val annotationOptionArg = args[1] as PolylineAnnotationOptions
            api.create(managerIdArg, annotationOptionArg) { result: Result<PolylineAnnotation> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.createMulti$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val annotationOptionsArg = args[1] as List<PolylineAnnotationOptions>
            api.createMulti(managerIdArg, annotationOptionsArg) { result: Result<List<PolylineAnnotation>> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.update$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val annotationArg = args[1] as PolylineAnnotation
            api.update(managerIdArg, annotationArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.delete$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val annotationArg = args[1] as PolylineAnnotation
            api.delete(managerIdArg, annotationArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.deleteAll$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.deleteAll(managerIdArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineCap$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineCapArg = LineCap.ofRaw(args[1] as Int)!!
            api.setLineCap(managerIdArg, lineCapArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineCap$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineCap(managerIdArg) { result: Result<LineCap?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data?.raw))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineMiterLimit$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineMiterLimitArg = args[1] as Double
            api.setLineMiterLimit(managerIdArg, lineMiterLimitArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineMiterLimit$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineMiterLimit(managerIdArg) { result: Result<Double?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineRoundLimit$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineRoundLimitArg = args[1] as Double
            api.setLineRoundLimit(managerIdArg, lineRoundLimitArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineRoundLimit$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineRoundLimit(managerIdArg) { result: Result<Double?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineDasharray$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineDasharrayArg = args[1] as List<Double?>
            api.setLineDasharray(managerIdArg, lineDasharrayArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineDasharray$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineDasharray(managerIdArg) { result: Result<List<Double?>?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineDepthOcclusionFactor$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineDepthOcclusionFactorArg = args[1] as Double
            api.setLineDepthOcclusionFactor(managerIdArg, lineDepthOcclusionFactorArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineDepthOcclusionFactor$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineDepthOcclusionFactor(managerIdArg) { result: Result<Double?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineEmissiveStrength$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineEmissiveStrengthArg = args[1] as Double
            api.setLineEmissiveStrength(managerIdArg, lineEmissiveStrengthArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineEmissiveStrength$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineEmissiveStrength(managerIdArg) { result: Result<Double?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineTranslate$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineTranslateArg = args[1] as List<Double?>
            api.setLineTranslate(managerIdArg, lineTranslateArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineTranslate$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineTranslate(managerIdArg) { result: Result<List<Double?>?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineTranslateAnchor$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineTranslateAnchorArg = LineTranslateAnchor.ofRaw(args[1] as Int)!!
            api.setLineTranslateAnchor(managerIdArg, lineTranslateAnchorArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineTranslateAnchor$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineTranslateAnchor(managerIdArg) { result: Result<LineTranslateAnchor?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data?.raw))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.setLineTrimOffset$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            val lineTrimOffsetArg = args[1] as List<Double?>
            api.setLineTrimOffset(managerIdArg, lineTrimOffsetArg) { result: Result<Unit> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                reply.reply(wrapResult(null))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
      run {
        val channel = BasicMessageChannel<Any?>(binaryMessenger, "dev.flutter.pigeon.mapbox_maps_flutter._PolylineAnnotationMessenger.getLineTrimOffset$separatedMessageChannelSuffix", codec)
        if (api != null) {
          channel.setMessageHandler { message, reply ->
            val args = message as List<Any?>
            val managerIdArg = args[0] as String
            api.getLineTrimOffset(managerIdArg) { result: Result<List<Double?>?> ->
              val error = result.exceptionOrNull()
              if (error != null) {
                reply.reply(wrapError(error))
              } else {
                val data = result.getOrNull()
                reply.reply(wrapResult(data))
              }
            }
          }
        } else {
          channel.setMessageHandler(null)
        }
      }
    }
  }
}