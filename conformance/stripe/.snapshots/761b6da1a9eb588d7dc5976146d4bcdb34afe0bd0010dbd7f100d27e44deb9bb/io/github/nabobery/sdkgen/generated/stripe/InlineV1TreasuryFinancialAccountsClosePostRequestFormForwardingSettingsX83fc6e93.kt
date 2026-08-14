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
 * A different bank account where funds can be deposited/debited in order to get the closing FA's balance to $0
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1close/post/requestBody/c
 * ontent/application~1x-www-form-urlencoded/schema/properties/forwarding_settings
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93.Serializer::class)
public class InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93(
  public val type: InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e,
  public val financialAccount: String? = null,
  public val paymentMethod: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e? = null

    public var type: InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var financialAccount: String? = null

    public var paymentMethod: String? = null

    public fun build(): InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93 {
      check(typeValue != null) { "type is required" }
      return InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93(
        type = type,
        financialAccount = financialAccount,
        paymentMethod = paymentMethod,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93 must be a JSON object")
      val type = json.decodeRequired<InlineV1TreasuryFinancialAad8dPostRequestFormForwardingSettingsTypeXfa44714e>(rawObject, "type")
      return InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93(
        type = type,
        financialAccount = rawObject["financial_account"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.financialAccount?.let { put("financial_account", it) }
        value.paymentMethod?.let { put("payment_method", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93(block: InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93.Builder.() -> Unit): InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93 = InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
