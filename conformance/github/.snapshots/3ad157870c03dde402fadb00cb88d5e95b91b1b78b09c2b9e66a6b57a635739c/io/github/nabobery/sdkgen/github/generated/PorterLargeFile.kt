package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Porter Large File
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/porter-large-file
 */
@Serializable(with = PorterLargeFile.Serializer::class)
public class PorterLargeFile(
  public val oid: String,
  public val path: String,
  public val refName: String,
  public val size: Int,
) {
  public class Builder {
    private var oidValue: String? = null

    public var oid: String
      get() = requireNotNull(oidValue) { "oid is required" }
      set(`value`) {
        oidValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var refNameValue: String? = null

    public var refName: String
      get() = requireNotNull(refNameValue) { "refName is required" }
      set(`value`) {
        refNameValue = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    public fun build(): PorterLargeFile {
      check(oidValue != null) { "oid is required" }
      check(pathValue != null) { "path is required" }
      check(refNameValue != null) { "refName is required" }
      check(sizeValue != null) { "size is required" }
      return PorterLargeFile(
        oid = oid,
        path = path,
        refName = refName,
        size = size,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PorterLargeFile = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PorterLargeFile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PorterLargeFile {
      val jsonDecoder = decoder.requireJsonDecoder("PorterLargeFile")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PorterLargeFile must be a JSON object")
      val oid = json.decodeRequired<String>(rawObject, "oid")
      val path = json.decodeRequired<String>(rawObject, "path")
      val refName = json.decodeRequired<String>(rawObject, "ref_name")
      val size = json.decodeRequired<Int>(rawObject, "size")
      return PorterLargeFile(
        oid = oid,
        path = path,
        refName = refName,
        size = size,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PorterLargeFile) {
      val jsonEncoder = encoder.requireJsonEncoder("PorterLargeFile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("oid", value.oid)
        put("path", value.path)
        put("ref_name", value.refName)
        put("size", json.encodeToJsonElement(value.size))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun porterLargeFile(block: PorterLargeFile.Builder.() -> Unit): PorterLargeFile = PorterLargeFile.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PorterLargeFile is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
