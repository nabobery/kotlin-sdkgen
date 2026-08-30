package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 * If this is an `us_bank_account` PaymentMethod, this hash contains details about the US bank account payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/us_bank_account
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015(
  public val accountHolderType:
      InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d? = null,
  public val accountType:
      InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976? = null,
) {
  public class Builder {
    public var accountHolderType:
        InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d? = null

    public var accountType: InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976?
        = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015 = InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015(
      accountHolderType = accountHolderType,
      accountType = accountType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015(
        accountHolderType = rawObject["account_holder_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountHolderTypeXbfa3483d>(it) },
        accountType = rawObject["account_type"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
        value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015(block: InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015 = InlineV1PaymentMethodsPostRequestFormUsBankAccountX4cb94015.build(block)
