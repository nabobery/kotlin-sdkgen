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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts~1{id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts~1{id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormX92af665f.Serializer::class)
public class InlineV1CustomersBankAccountsPostRequestFormX92af665f(
  /**
   * The name of the person or business that owns the bank account.
   */
  public val accountHolderName: String? = null,
  /**
   * The type of entity that holds the account. This can be either `individual` or `company`.
   */
  public val accountHolderType:
      InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8? = null,
  /**
   * City/District/Suburb/Town/Village.
   */
  public val addressCity: String? = null,
  /**
   * Billing address country, if provided when creating card.
   */
  public val addressCountry: String? = null,
  /**
   * Address line 1 (Street address/PO Box/Company name).
   */
  public val addressLine1: String? = null,
  /**
   * Address line 2 (Apartment/Suite/Unit/Building).
   */
  public val addressLine2: String? = null,
  /**
   * State/County/Province/Region.
   */
  public val addressState: String? = null,
  /**
   * ZIP or postal code.
   */
  public val addressZip: String? = null,
  /**
   * Two digit number representing the card’s expiration month.
   */
  public val expMonth: String? = null,
  /**
   * Four digit number representing the card’s expiration year.
   */
  public val expYear: String? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b? = null,
  /**
   * Cardholder name.
   */
  public val name: String? = null,
  public val owner: InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The name of the person or business that owns the bank account.
     */
    public var accountHolderName: String? = null

    /**
     * The type of entity that holds the account. This can be either `individual` or `company`.
     */
    public var accountHolderType:
        InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8? = null

    /**
     * City/District/Suburb/Town/Village.
     */
    public var addressCity: String? = null

    /**
     * Billing address country, if provided when creating card.
     */
    public var addressCountry: String? = null

    /**
     * Address line 1 (Street address/PO Box/Company name).
     */
    public var addressLine1: String? = null

    /**
     * Address line 2 (Apartment/Suite/Unit/Building).
     */
    public var addressLine2: String? = null

    /**
     * State/County/Province/Region.
     */
    public var addressState: String? = null

    /**
     * ZIP or postal code.
     */
    public var addressZip: String? = null

    /**
     * Two digit number representing the card’s expiration month.
     */
    public var expMonth: String? = null

    /**
     * Four digit number representing the card’s expiration year.
     */
    public var expYear: String? = null

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
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b? = null

    /**
     * Cardholder name.
     */
    public var name: String? = null

    public var owner: InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d? = null

    public fun build(): InlineV1CustomersBankAccountsPostRequestFormX92af665f = InlineV1CustomersBankAccountsPostRequestFormX92af665f(
      accountHolderName = accountHolderName,
      accountHolderType = accountHolderType,
      addressCity = addressCity,
      addressCountry = addressCountry,
      addressLine1 = addressLine1,
      addressLine2 = addressLine2,
      addressState = addressState,
      addressZip = addressZip,
      expMonth = expMonth,
      expYear = expYear,
      expand = expand,
      metadata = metadata,
      name = name,
      owner = owner,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormX92af665f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormX92af665f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormX92af665f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsPostRequestFormX92af665f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersBankAccountsPostRequestFormX92af665f must be a JSON object")
      return InlineV1CustomersBankAccountsPostRequestFormX92af665f(
        accountHolderName = rawObject["account_holder_name"]?.let { json.decodeFromJsonElement<String>(it) },
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeX940a31c8>(it) },
        addressCity = rawObject["address_city"]?.let { json.decodeFromJsonElement<String>(it) },
        addressCountry = rawObject["address_country"]?.let { json.decodeFromJsonElement<String>(it) },
        addressLine1 = rawObject["address_line1"]?.let { json.decodeFromJsonElement<String>(it) },
        addressLine2 = rawObject["address_line2"]?.let { json.decodeFromJsonElement<String>(it) },
        addressState = rawObject["address_state"]?.let { json.decodeFromJsonElement<String>(it) },
        addressZip = rawObject["address_zip"]?.let { json.decodeFromJsonElement<String>(it) },
        expMonth = rawObject["exp_month"]?.let { json.decodeFromJsonElement<String>(it) },
        expYear = rawObject["exp_year"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormX92af665f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersBankAccountsPostRequestFormX92af665f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountHolderName?.let { put("account_holder_name", it) }
        value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
        value.addressCity?.let { put("address_city", it) }
        value.addressCountry?.let { put("address_country", it) }
        value.addressLine1?.let { put("address_line1", it) }
        value.addressLine2?.let { put("address_line2", it) }
        value.addressState?.let { put("address_state", it) }
        value.addressZip?.let { put("address_zip", it) }
        value.expMonth?.let { put("exp_month", it) }
        value.expYear?.let { put("exp_year", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersBankAccountsPostRequestFormX92af665f(block: InlineV1CustomersBankAccountsPostRequestFormX92af665f.Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormX92af665f = InlineV1CustomersBankAccountsPostRequestFormX92af665f.build(block)
