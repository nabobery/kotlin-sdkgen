package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_embedded_issuing_card_features
 */
@Serializable(with = ConnectEmbeddedIssuingCardFeatures.Serializer::class)
public class ConnectEmbeddedIssuingCardFeatures(
  /**
   * Whether to allow card management features.
   */
  public val cardManagement: Boolean,
  /**
   * Whether to allow card spend dispute management features.
   */
  public val cardSpendDisputeManagement: Boolean,
  /**
   * Whether to allow cardholder management features.
   */
  public val cardholderManagement: Boolean,
  /**
   * Whether to allow spend control management features.
   */
  public val spendControlManagement: Boolean,
) {
  public class Builder {
    private var cardManagementValue: Boolean? = null

    public var cardManagement: Boolean
      get() = requireNotNull(cardManagementValue) { "cardManagement is required" }
      set(`value`) {
        cardManagementValue = value
      }

    private var cardSpendDisputeManagementValue: Boolean? = null

    public var cardSpendDisputeManagement: Boolean
      get() = requireNotNull(cardSpendDisputeManagementValue) { "cardSpendDisputeManagement is required" }
      set(`value`) {
        cardSpendDisputeManagementValue = value
      }

    private var cardholderManagementValue: Boolean? = null

    public var cardholderManagement: Boolean
      get() = requireNotNull(cardholderManagementValue) { "cardholderManagement is required" }
      set(`value`) {
        cardholderManagementValue = value
      }

    private var spendControlManagementValue: Boolean? = null

    public var spendControlManagement: Boolean
      get() = requireNotNull(spendControlManagementValue) { "spendControlManagement is required" }
      set(`value`) {
        spendControlManagementValue = value
      }

    public fun build(): ConnectEmbeddedIssuingCardFeatures {
      check(cardManagementValue != null) { "cardManagement is required" }
      check(cardSpendDisputeManagementValue != null) { "cardSpendDisputeManagement is required" }
      check(cardholderManagementValue != null) { "cardholderManagement is required" }
      check(spendControlManagementValue != null) { "spendControlManagement is required" }
      return ConnectEmbeddedIssuingCardFeatures(
        cardManagement = cardManagement,
        cardSpendDisputeManagement = cardSpendDisputeManagement,
        cardholderManagement = cardholderManagement,
        spendControlManagement = spendControlManagement,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ConnectEmbeddedIssuingCardFeatures = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ConnectEmbeddedIssuingCardFeatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ConnectEmbeddedIssuingCardFeatures {
      val jsonDecoder = decoder.requireJsonDecoder("ConnectEmbeddedIssuingCardFeatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ConnectEmbeddedIssuingCardFeatures must be a JSON object")
      val cardManagement = json.decodeRequired<Boolean>(rawObject, "card_management")
      val cardSpendDisputeManagement = json.decodeRequired<Boolean>(rawObject, "card_spend_dispute_management")
      val cardholderManagement = json.decodeRequired<Boolean>(rawObject, "cardholder_management")
      val spendControlManagement = json.decodeRequired<Boolean>(rawObject, "spend_control_management")
      return ConnectEmbeddedIssuingCardFeatures(
        cardManagement = cardManagement,
        cardSpendDisputeManagement = cardSpendDisputeManagement,
        cardholderManagement = cardholderManagement,
        spendControlManagement = spendControlManagement,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ConnectEmbeddedIssuingCardFeatures) {
      val jsonEncoder = encoder.requireJsonEncoder("ConnectEmbeddedIssuingCardFeatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("card_management", json.encodeToJsonElement(value.cardManagement))
        put("card_spend_dispute_management", json.encodeToJsonElement(value.cardSpendDisputeManagement))
        put("cardholder_management", json.encodeToJsonElement(value.cardholderManagement))
        put("spend_control_management", json.encodeToJsonElement(value.spendControlManagement))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun connectEmbeddedIssuingCardFeatures(block: ConnectEmbeddedIssuingCardFeatures.Builder.() -> Unit): ConnectEmbeddedIssuingCardFeatures = ConnectEmbeddedIssuingCardFeatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ConnectEmbeddedIssuingCardFeatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
