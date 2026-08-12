package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1close/post/requestBody/c
 * ontent/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1close/post/requestBody/c
 * ontent/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0.Serializer::class)
public class InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0(
  expand: List<String>? = null,
  /**
   * A different bank account where funds can be deposited/debited in order to get the closing FA's balance to $0
   */
  public val forwardingSettings:
      InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A different bank account where funds can be deposited/debited in order to get the closing FA's balance to $0
     */
    public var forwardingSettings:
        InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93? = null

    public fun build(): InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0 = InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0(
      expand = expand,
      forwardingSettings = forwardingSettings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0 must be a JSON object")
      return InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        forwardingSettings = rawObject["forwarding_settings"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsClosePostRequestFormForwardingSettingsX83fc6e93>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.forwardingSettings?.let { put("forwarding_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0(block: InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0.Builder.() -> Unit): InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0 = InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0.build(block)
