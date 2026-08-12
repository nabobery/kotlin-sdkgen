package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A subset of parameters to be passed to PaymentIntent creation for Checkout Sessions in `payment` mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_intent_data
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7(
  public val captureMethod:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194? = null,
  public val description: String? = null,
  metadata: Map<String, String>? = null,
  public val setupFutureUsage:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataSetupFutureUsageXbcfd52b4? = null,
  public val statementDescriptor: String? = null,
  public val statementDescriptorSuffix: String? = null,
  public val transferGroup: String? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var captureMethod:
        InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194? = null

    public var description: String? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var setupFutureUsage:
        InlineV1PaymentLinksPostRequestFormPaymentIntentDataSetupFutureUsageXbcfd52b4? = null

    public var statementDescriptor: String? = null

    public var statementDescriptorSuffix: String? = null

    public var transferGroup: String? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7 = InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7(
      captureMethod = captureMethod,
      description = description,
      metadata = metadata,
      setupFutureUsage = setupFutureUsage,
      statementDescriptor = statementDescriptor,
      statementDescriptorSuffix = statementDescriptorSuffix,
      transferGroup = transferGroup,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataCaptureMethodX1d36c194>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataSetupFutureUsageXbcfd52b4>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorSuffix = rawObject["statement_descriptor_suffix"]?.let { json.decodeFromJsonElement<String>(it) },
        transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7(block: InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7 = InlineV1PaymentLinksPostRequestFormPaymentIntentDataXfc20e1b7.build(block)
