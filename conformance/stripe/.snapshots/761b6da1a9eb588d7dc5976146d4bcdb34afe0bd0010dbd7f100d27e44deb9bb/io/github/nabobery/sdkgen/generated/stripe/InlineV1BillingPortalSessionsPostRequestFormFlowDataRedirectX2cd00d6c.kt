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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/after_completion/properties/redirect.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/after_completion/properties/redirect
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c(
  public val returnUrl: String,
) {
  public class Builder {
    private var returnUrlValue: String? = null

    public var returnUrl: String
      get() = requireNotNull(returnUrlValue) { "returnUrl is required" }
      set(`value`) {
        returnUrlValue = value
      }

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c {
      check(returnUrlValue != null) { "returnUrl is required" }
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c(
        returnUrl = returnUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c must be a JSON object")
      val returnUrl = json.decodeRequired<String>(rawObject, "return_url")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c(
        returnUrl = returnUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("return_url", value.returnUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c = InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
