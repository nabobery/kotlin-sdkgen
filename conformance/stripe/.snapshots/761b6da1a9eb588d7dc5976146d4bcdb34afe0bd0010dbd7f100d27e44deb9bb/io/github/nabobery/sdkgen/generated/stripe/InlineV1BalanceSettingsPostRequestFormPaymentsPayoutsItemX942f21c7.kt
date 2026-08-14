package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency/anyOf/0/additionalPro
 * perties/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1balance_settings/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/payments/properties/payouts/properties/automatic_transfer_rules_by_currency/anyOf/0/additionalPro
 * perties/anyOf/0/items
 */
@Serializable(with = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7.Serializer::class)
public class InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7(
  public val payoutMethod: String,
  public val type: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754,
  public val transferUpToAmount: Int? = null,
) {
  public class Builder {
    private var payoutMethodValue: String? = null

    public var payoutMethod: String
      get() = requireNotNull(payoutMethodValue) { "payoutMethod is required" }
      set(`value`) {
        payoutMethodValue = value
      }

    private var typeValue: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754? =
        null

    public var type: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var transferUpToAmount: Int? = null

    public fun build(): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7 {
      check(payoutMethodValue != null) { "payoutMethod is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7(
        payoutMethod = payoutMethod,
        type = type,
        transferUpToAmount = transferUpToAmount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7 must be a JSON object")
      val payoutMethod = json.decodeRequired<String>(rawObject, "payout_method")
      val type = json.decodeRequired<InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsTypeX81f8b754>(rawObject, "type")
      return InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7(
        payoutMethod = payoutMethod,
        type = type,
        transferUpToAmount = rawObject["transfer_up_to_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payout_method", value.payoutMethod)
        put("type", json.encodeToJsonElement(value.type))
        value.transferUpToAmount?.let { put("transfer_up_to_amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7(block: InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7.Builder.() -> Unit): InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7 = InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BalanceSettingsPostRequestFormPaymentsPayoutsItemX942f21c7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
