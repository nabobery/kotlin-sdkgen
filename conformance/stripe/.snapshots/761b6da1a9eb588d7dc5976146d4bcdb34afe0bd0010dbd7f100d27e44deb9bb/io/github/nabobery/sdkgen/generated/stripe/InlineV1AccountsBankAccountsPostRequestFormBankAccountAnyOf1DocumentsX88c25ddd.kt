package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/documents.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/documents
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd.Serializer::class)
public class InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd(
  public val bankAccountOwnershipVerification:
      InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eX49b723e1? = null,
) {
  public class Builder {
    public var bankAccountOwnershipVerification:
        InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eX49b723e1? = null

    public fun build(): InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd = InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd(
      bankAccountOwnershipVerification = bankAccountOwnershipVerification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd must be a JSON object")
      return InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd(
        bankAccountOwnershipVerification = rawObject["bank_account_ownership_verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eX49b723e1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankAccountOwnershipVerification?.let { put("bank_account_ownership_verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd(block: InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd.Builder.() -> Unit): InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd = InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1DocumentsX88c25ddd.build(block)
