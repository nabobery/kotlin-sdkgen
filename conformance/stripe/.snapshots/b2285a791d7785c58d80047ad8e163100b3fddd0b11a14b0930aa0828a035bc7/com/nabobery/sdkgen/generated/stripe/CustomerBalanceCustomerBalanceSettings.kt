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
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_balance_customer_balance_settings
 */
@Serializable(with = CustomerBalanceCustomerBalanceSettings.Serializer::class)
public class CustomerBalanceCustomerBalanceSettings(
  /**
   * The configuration for how funds that land in the customer cash balance are reconciled.
   */
  public val reconciliationMode:
      InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4,
  /**
   * A flag to indicate if reconciliation mode returned is the user's default or is specific to this customer cash
   * balance
   */
  public val usingMerchantDefault: Boolean,
) {
  public class Builder {
    private var reconciliationModeValue:
        InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4? = null

    public var reconciliationMode:
        InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4
      get() = requireNotNull(reconciliationModeValue) { "reconciliationMode is required" }
      set(`value`) {
        reconciliationModeValue = value
      }

    private var usingMerchantDefaultValue: Boolean? = null

    public var usingMerchantDefault: Boolean
      get() = requireNotNull(usingMerchantDefaultValue) { "usingMerchantDefault is required" }
      set(`value`) {
        usingMerchantDefaultValue = value
      }

    public fun build(): CustomerBalanceCustomerBalanceSettings {
      check(reconciliationModeValue != null) { "reconciliationMode is required" }
      check(usingMerchantDefaultValue != null) { "usingMerchantDefault is required" }
      return CustomerBalanceCustomerBalanceSettings(
        reconciliationMode = reconciliationMode,
        usingMerchantDefault = usingMerchantDefault,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomerBalanceCustomerBalanceSettings = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CustomerBalanceCustomerBalanceSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomerBalanceCustomerBalanceSettings {
      val jsonDecoder = decoder.requireJsonDecoder("CustomerBalanceCustomerBalanceSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomerBalanceCustomerBalanceSettings must be a JSON object")
      val reconciliationMode = json.decodeRequired<InlineCustomerBalanceCustomerBalanceSettingsReconciliationModeXdf2054c4>(rawObject, "reconciliation_mode")
      val usingMerchantDefault = json.decodeRequired<Boolean>(rawObject, "using_merchant_default")
      return CustomerBalanceCustomerBalanceSettings(
        reconciliationMode = reconciliationMode,
        usingMerchantDefault = usingMerchantDefault,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomerBalanceCustomerBalanceSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomerBalanceCustomerBalanceSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reconciliation_mode", json.encodeToJsonElement(value.reconciliationMode))
        put("using_merchant_default", json.encodeToJsonElement(value.usingMerchantDefault))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customerBalanceCustomerBalanceSettings(block: CustomerBalanceCustomerBalanceSettings.Builder.() -> Unit): CustomerBalanceCustomerBalanceSettings = CustomerBalanceCustomerBalanceSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomerBalanceCustomerBalanceSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
