package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PortalFlowsAfterCompletionHostedConfirmationView(
  @SerialName("custom_message")
  public val customMessage: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_after_completion_hosted_confirmation
 */
@Serializable(with = PortalFlowsAfterCompletionHostedConfirmation.Serializer::class)
public class PortalFlowsAfterCompletionHostedConfirmation(
  /**
   * A custom message to display to the customer after the flow is completed.
   */
  public val customMessage: String? = null,
) {
  public class Builder {
    /**
     * A custom message to display to the customer after the flow is completed.
     */
    public var customMessage: String? = null

    public fun build(): PortalFlowsAfterCompletionHostedConfirmation = PortalFlowsAfterCompletionHostedConfirmation(
      customMessage = customMessage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsAfterCompletionHostedConfirmation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PortalFlowsAfterCompletionHostedConfirmation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsAfterCompletionHostedConfirmation {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsAfterCompletionHostedConfirmation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsAfterCompletionHostedConfirmation must be a JSON object")
      return PortalFlowsAfterCompletionHostedConfirmation(
        customMessage = rawObject["custom_message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsAfterCompletionHostedConfirmation) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsAfterCompletionHostedConfirmation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customMessage?.let { put("custom_message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsAfterCompletionHostedConfirmation(block: PortalFlowsAfterCompletionHostedConfirmation.Builder.() -> Unit): PortalFlowsAfterCompletionHostedConfirmation = PortalFlowsAfterCompletionHostedConfirmation.build(block)
