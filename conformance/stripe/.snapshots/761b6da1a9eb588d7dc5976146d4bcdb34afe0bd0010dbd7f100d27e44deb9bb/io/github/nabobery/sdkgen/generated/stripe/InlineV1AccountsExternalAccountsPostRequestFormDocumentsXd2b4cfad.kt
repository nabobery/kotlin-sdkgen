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
 * Documents that may be submitted to satisfy various informational requests.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts~1{id}/post/requestBody/content/appli
 * cation~1x-www-form-urlencoded/schema/properties/documents
 */
@Serializable(with = InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad.Serializer::class)
public class InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad(
  public val bankAccountOwnershipVerification:
      InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea? = null,
) {
  public class Builder {
    public var bankAccountOwnershipVerification:
        InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea? = null

    public fun build(): InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad = InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad(
      bankAccountOwnershipVerification = bankAccountOwnershipVerification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad must be a JSON object")
      return InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad(
        bankAccountOwnershipVerification = rawObject["bank_account_ownership_verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankAccountOwnershipVerification?.let { put("bank_account_ownership_verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad(block: InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad.Builder.() -> Unit): InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad = InlineV1AccountsExternalAccountsPostRequestFormDocumentsXd2b4cfad.build(block)
