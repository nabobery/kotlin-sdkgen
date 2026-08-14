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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/nullable-community-health-file.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-community-health-file
 */
@Serializable(with = NullableCommunityHealthFile.Serializer::class)
public class NullableCommunityHealthFile(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): NullableCommunityHealthFile {
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(urlValue != null) { "url is required" }
      return NullableCommunityHealthFile(
        htmlUrl = htmlUrl,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableCommunityHealthFile = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NullableCommunityHealthFile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableCommunityHealthFile {
      val jsonDecoder = decoder.requireJsonDecoder("NullableCommunityHealthFile")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableCommunityHealthFile must be a JSON object")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val url = json.decodeRequired<String>(rawObject, "url")
      return NullableCommunityHealthFile(
        htmlUrl = htmlUrl,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableCommunityHealthFile) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableCommunityHealthFile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html_url", value.htmlUrl)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableCommunityHealthFile(block: NullableCommunityHealthFile.Builder.() -> Unit): NullableCommunityHealthFile = NullableCommunityHealthFile.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullableCommunityHealthFile is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
