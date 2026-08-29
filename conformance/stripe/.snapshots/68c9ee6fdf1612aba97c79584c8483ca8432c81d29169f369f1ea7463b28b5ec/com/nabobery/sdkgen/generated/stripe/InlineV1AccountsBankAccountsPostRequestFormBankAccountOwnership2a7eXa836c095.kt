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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts~1{id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/documents/properties/bank_account_ownership_verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts~1{id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/documents/properties/bank_account_ownership_verification
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095.Serializer::class)
public class InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095(
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

    public fun build(): InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095 = InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095 must be a JSON object")
      return InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095(block: InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095.Builder.() -> Unit): InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095 = InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095.build(block)
