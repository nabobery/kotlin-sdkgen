package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormX18e3bf43.Serializer::class)
public class InlineV1CustomersBankAccountsPostRequestFormX18e3bf43(
  /**
   * A token returned by [Stripe.js](https://stripe.com/docs/js) representing the user’s Alipay account details.
   */
  public val alipayAccount: String? = null,
  /**
   * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
   * user's bank account details.
   */
  public val bankAccount: InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a? = null,
  /**
   * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
   */
  public val card: InlineV1CustomersBankAccountsPostRequestFormCardX6337a169? = null,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * Please refer to full [documentation](https://api.stripe.com) instead.
   */
  public val source: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * A token returned by [Stripe.js](https://stripe.com/docs/js) representing the user’s Alipay account details.
     */
    public var alipayAccount: String? = null

    /**
     * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
     * user's bank account details.
     */
    public var bankAccount: InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a? = null

    /**
     * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
     */
    public var card: InlineV1CustomersBankAccountsPostRequestFormCardX6337a169? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Please refer to full [documentation](https://api.stripe.com) instead.
     */
    public var source: String? = null

    public fun build(): InlineV1CustomersBankAccountsPostRequestFormX18e3bf43 = InlineV1CustomersBankAccountsPostRequestFormX18e3bf43(
      alipayAccount = alipayAccount,
      bankAccount = bankAccount,
      card = card,
      expand = expand,
      metadata = metadata,
      source = source,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormX18e3bf43 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormX18e3bf43> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormX18e3bf43 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsPostRequestFormX18e3bf43")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersBankAccountsPostRequestFormX18e3bf43 must be a JSON object")
      return InlineV1CustomersBankAccountsPostRequestFormX18e3bf43(
        alipayAccount = rawObject["alipay_account"]?.let { json.decodeFromJsonElement<String>(it) },
        bankAccount = rawObject["bank_account"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormBankAccountX4187b37a>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormCardX6337a169>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        source = rawObject["source"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormX18e3bf43) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersBankAccountsPostRequestFormX18e3bf43")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.alipayAccount?.let { put("alipay_account", it) }
        value.bankAccount?.let { put("bank_account", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.source?.let { put("source", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersBankAccountsPostRequestFormX18e3bf43(block: InlineV1CustomersBankAccountsPostRequestFormX18e3bf43.Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormX18e3bf43 = InlineV1CustomersBankAccountsPostRequestFormX18e3bf43.build(block)
