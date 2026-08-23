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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/documents.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/documents
 */
@Serializable(with = InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0.Serializer::class)
public class InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0(
  public val bankAccountOwnershipVerification:
      InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX100b20de? = null,
) {
  public class Builder {
    public var bankAccountOwnershipVerification:
        InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX100b20de? = null

    public fun build(): InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0 = InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0(
      bankAccountOwnershipVerification = bankAccountOwnershipVerification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0 must be a JSON object")
      return InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0(
        bankAccountOwnershipVerification = rawObject["bank_account_ownership_verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX100b20de>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankAccountOwnershipVerification?.let { put("bank_account_ownership_verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0(block: InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0.Builder.() -> Unit): InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0 = InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0.build(block)
