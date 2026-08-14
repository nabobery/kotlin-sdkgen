package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TokensPostRequestFormX37c67bb3.Serializer::class)
public class InlineV1TokensPostRequestFormX37c67bb3(
  /**
   * Information for the account this token represents.
   */
  public val account: InlineV1TokensPostRequestFormAccountXe0f6a7b3? = null,
  /**
   * The bank account this token will represent.
   */
  public val bankAccount: InlineV1TokensPostRequestFormBankAccountX662538df? = null,
  /**
   * The card this token will represent. If you also pass in a customer, the card must be the ID of a card belonging to
   * the customer. Otherwise, if you do not pass in a customer, this is a dictionary containing a user's credit card
   * details, with the options described below.
   */
  public val card: InlineV1TokensPostRequestFormCardX3af5dd08? = null,
  /**
   * Create a token for the customer, which is owned by the application's account. You can only use this with an [OAuth
   * access token](https://docs.stripe.com/connect/standard-accounts) or [Stripe-Account
   * header](https://docs.stripe.com/connect/authentication). Learn more about [cloning saved payment
   * methods](https://docs.stripe.com/connect/cloning-saved-payment-methods).
   */
  public val customer: String? = null,
  /**
   * The updated CVC value this token represents.
   */
  public val cvcUpdate: InlineV1TokensPostRequestFormCvcUpdateX5188265b? = null,
  expand: List<String>? = null,
  /**
   * Information for the person this token represents.
   */
  public val person: InlineV1TokensPostRequestFormPersonX2c9b4fc3? = null,
  /**
   * The PII this token represents.
   */
  public val pii: InlineV1TokensPostRequestFormPiiX0553cae2? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Information for the account this token represents.
     */
    public var account: InlineV1TokensPostRequestFormAccountXe0f6a7b3? = null

    /**
     * The bank account this token will represent.
     */
    public var bankAccount: InlineV1TokensPostRequestFormBankAccountX662538df? = null

    /**
     * The card this token will represent. If you also pass in a customer, the card must be the ID of a card belonging
     * to the customer. Otherwise, if you do not pass in a customer, this is a dictionary containing a user's credit
     * card details, with the options described below.
     */
    public var card: InlineV1TokensPostRequestFormCardX3af5dd08? = null

    /**
     * Create a token for the customer, which is owned by the application's account. You can only use this with an
     * [OAuth access token](https://docs.stripe.com/connect/standard-accounts) or [Stripe-Account
     * header](https://docs.stripe.com/connect/authentication). Learn more about [cloning saved payment
     * methods](https://docs.stripe.com/connect/cloning-saved-payment-methods).
     */
    public var customer: String? = null

    /**
     * The updated CVC value this token represents.
     */
    public var cvcUpdate: InlineV1TokensPostRequestFormCvcUpdateX5188265b? = null

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
     * Information for the person this token represents.
     */
    public var person: InlineV1TokensPostRequestFormPersonX2c9b4fc3? = null

    /**
     * The PII this token represents.
     */
    public var pii: InlineV1TokensPostRequestFormPiiX0553cae2? = null

    public fun build(): InlineV1TokensPostRequestFormX37c67bb3 = InlineV1TokensPostRequestFormX37c67bb3(
      account = account,
      bankAccount = bankAccount,
      card = card,
      customer = customer,
      cvcUpdate = cvcUpdate,
      expand = expand,
      person = person,
      pii = pii,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormX37c67bb3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormX37c67bb3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormX37c67bb3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormX37c67bb3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormX37c67bb3 must be a JSON object")
      return InlineV1TokensPostRequestFormX37c67bb3(
        account = rawObject["account"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountXe0f6a7b3>(it) },
        bankAccount = rawObject["bank_account"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormBankAccountX662538df>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormCardX3af5dd08>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        cvcUpdate = rawObject["cvc_update"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormCvcUpdateX5188265b>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        person = rawObject["person"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonX2c9b4fc3>(it) },
        pii = rawObject["pii"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPiiX0553cae2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormX37c67bb3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormX37c67bb3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.account?.let { put("account", json.encodeToJsonElement(it)) }
        value.bankAccount?.let { put("bank_account", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", it) }
        value.cvcUpdate?.let { put("cvc_update", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.person?.let { put("person", json.encodeToJsonElement(it)) }
        value.pii?.let { put("pii", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormX37c67bb3(block: InlineV1TokensPostRequestFormX37c67bb3.Builder.() -> Unit): InlineV1TokensPostRequestFormX37c67bb3 = InlineV1TokensPostRequestFormX37c67bb3.build(block)
