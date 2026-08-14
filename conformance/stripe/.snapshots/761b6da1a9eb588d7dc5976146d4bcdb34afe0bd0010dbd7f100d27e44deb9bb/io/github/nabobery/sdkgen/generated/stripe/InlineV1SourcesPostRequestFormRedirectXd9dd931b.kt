package io.github.nabobery.sdkgen.generated.stripe

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
 * Parameters required for the redirect flow. Required if the source is authenticated by a redirect (`flow` is
 * `redirect`).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/redirect
 */
@Serializable(with = InlineV1SourcesPostRequestFormRedirectXd9dd931b.Serializer::class)
public class InlineV1SourcesPostRequestFormRedirectXd9dd931b(
  public val returnUrl: String,
) {
  public class Builder {
    private var returnUrlValue: String? = null

    public var returnUrl: String
      get() = requireNotNull(returnUrlValue) { "returnUrl is required" }
      set(`value`) {
        returnUrlValue = value
      }

    public fun build(): InlineV1SourcesPostRequestFormRedirectXd9dd931b {
      check(returnUrlValue != null) { "returnUrl is required" }
      return InlineV1SourcesPostRequestFormRedirectXd9dd931b(
        returnUrl = returnUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormRedirectXd9dd931b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormRedirectXd9dd931b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormRedirectXd9dd931b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormRedirectXd9dd931b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormRedirectXd9dd931b must be a JSON object")
      val returnUrl = json.decodeRequired<String>(rawObject, "return_url")
      return InlineV1SourcesPostRequestFormRedirectXd9dd931b(
        returnUrl = returnUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormRedirectXd9dd931b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormRedirectXd9dd931b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("return_url", value.returnUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SourcesPostRequestFormRedirectXd9dd931b(block: InlineV1SourcesPostRequestFormRedirectXd9dd931b.Builder.() -> Unit): InlineV1SourcesPostRequestFormRedirectXd9dd931b = InlineV1SourcesPostRequestFormRedirectXd9dd931b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SourcesPostRequestFormRedirectXd9dd931b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
