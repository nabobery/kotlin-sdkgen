package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/after_completion/properties/hosted_confirmation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/flow_data/properties/after_completion/properties/hosted_confirmation
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7(
  public val customMessage: String? = null,
) {
  public class Builder {
    public var customMessage: String? = null

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7 = InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7(
      customMessage = customMessage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7 must be a JSON object")
      return InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7(
        customMessage = rawObject["custom_message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customMessage?.let { put("custom_message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7(block: InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7 = InlineV1BillingPortalSessionsPostRequestFormFlowDataHostedConfirmationXba1280c7.build(block)
