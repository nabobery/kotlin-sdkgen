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
 * sdkgen://source/openapi.json#/paths/~1v1~1external_accounts~1{id}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/documents
 */
@Serializable(with = InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c.Serializer::class)
public class InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c(
  public val bankAccountOwnershipVerification:
      InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38? = null,
) {
  public class Builder {
    public var bankAccountOwnershipVerification:
        InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38? = null

    public fun build(): InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c = InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c(
      bankAccountOwnershipVerification = bankAccountOwnershipVerification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c must be a JSON object")
      return InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c(
        bankAccountOwnershipVerification = rawObject["bank_account_ownership_verification"]?.let { json.decodeFromJsonElement<InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankAccountOwnershipVerification?.let { put("bank_account_ownership_verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c(block: InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c.Builder.() -> Unit): InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c = InlineV1ExternalAccountsPostRequestFormDocumentsXd8f2694c.build(block)
