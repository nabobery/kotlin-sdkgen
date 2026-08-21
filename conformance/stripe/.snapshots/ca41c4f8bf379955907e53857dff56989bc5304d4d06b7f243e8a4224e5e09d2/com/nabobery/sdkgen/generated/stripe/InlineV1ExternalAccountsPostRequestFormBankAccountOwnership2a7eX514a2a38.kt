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
 * sdkgen://source/openapi.json#/paths/~1v1~1external_accounts~1{id}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/documents/properties/bank_account_ownership_verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1external_accounts~1{id}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/documents/properties/bank_account_ownership_verification
 */
@Serializable(with = InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38.Serializer::class)
public class InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38(
  files: List<String>? = null,
) {
  public val files: List<String>? = files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue: List<String>? = null

    public var files: List<String>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38 = InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38 must be a JSON object")
      return InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38(block: InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38.Builder.() -> Unit): InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38 = InlineV1ExternalAccountsPostRequestFormBankAccountOwnership2a7eX514a2a38.build(block)
