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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/after_completion.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/after_completion
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920(
  public val type: InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae,
  public val hostedConfirmation:
      InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7? = null,
  public val redirect:
      InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae? = null

    public var type:
        InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var hostedConfirmation:
        InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7? = null

    public var redirect: InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c? =
        null

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920 {
      check(typeValue != null) { "type is required" }
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920(
        type = type,
        hostedConfirmation = hostedConfirmation,
        redirect = redirect,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920 must be a JSON object")
      val type = json.decodeRequired<InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionTypeX2b9e28ae>(rawObject, "type")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920(
        type = type,
        hostedConfirmation = rawObject["hosted_confirmation"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7>(it) },
        redirect = rawObject["redirect"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormFlowDataRedirectX2cd00d6c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.hostedConfirmation?.let { put("hosted_confirmation", json.encodeToJsonElement(it)) }
        value.redirect?.let { put("redirect", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920 = InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataAfterCompletionX80448920 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
