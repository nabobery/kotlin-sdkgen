package com.nabobery.sdkgen.github.generated

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
 * Short Blob
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/short-blob
 */
@Serializable(with = ShortBlob.Serializer::class)
public class ShortBlob(
  public val sha: String,
  public val url: String,
) {
  public class Builder {
    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): ShortBlob {
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return ShortBlob(
        sha = sha,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShortBlob = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ShortBlob> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShortBlob {
      val jsonDecoder = decoder.requireJsonDecoder("ShortBlob")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ShortBlob must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return ShortBlob(
        sha = sha,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShortBlob) {
      val jsonEncoder = encoder.requireJsonEncoder("ShortBlob")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shortBlob(block: ShortBlob.Builder.() -> Unit): ShortBlob = ShortBlob.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShortBlob is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
