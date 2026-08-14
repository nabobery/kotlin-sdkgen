package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * A description of the detector used.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/snapshot/properties/detector
 */
@Serializable(with = InlineSnapshotDetectorX656c3950.Serializer::class)
public class InlineSnapshotDetectorX656c3950(
  /**
   * The name of the detector used.
   */
  public val name: String,
  /**
   * The url of the detector used.
   */
  public val url: String,
  /**
   * The version of the detector used.
   */
  public val version: String,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var versionValue: String? = null

    public var version: String
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    public fun build(): InlineSnapshotDetectorX656c3950 {
      check(nameValue != null) { "name is required" }
      check(urlValue != null) { "url is required" }
      check(versionValue != null) { "version is required" }
      return InlineSnapshotDetectorX656c3950(
        name = name,
        url = url,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSnapshotDetectorX656c3950 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSnapshotDetectorX656c3950> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSnapshotDetectorX656c3950 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSnapshotDetectorX656c3950")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSnapshotDetectorX656c3950 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val url = json.decodeRequired<String>(rawObject, "url")
      val version = json.decodeRequired<String>(rawObject, "version")
      return InlineSnapshotDetectorX656c3950(
        name = name,
        url = url,
        version = version,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSnapshotDetectorX656c3950) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSnapshotDetectorX656c3950")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("url", value.url)
        put("version", value.version)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSnapshotDetectorX656c3950(block: InlineSnapshotDetectorX656c3950.Builder.() -> Unit): InlineSnapshotDetectorX656c3950 = InlineSnapshotDetectorX656c3950.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSnapshotDetectorX656c3950 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
