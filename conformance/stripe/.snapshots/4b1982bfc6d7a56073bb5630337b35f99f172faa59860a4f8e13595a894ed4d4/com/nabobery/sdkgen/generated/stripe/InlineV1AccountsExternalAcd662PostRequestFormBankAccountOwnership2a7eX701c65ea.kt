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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts~1{id}/post/requestBody/content/appli
 * cation~1x-www-form-urlencoded/schema/properties/documents/properties/bank_account_ownership_verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts~1{id}/post/requestBody/content/appli
 * cation~1x-www-form-urlencoded/schema/properties/documents/properties/bank_account_ownership_verification
 */
@Serializable(with = InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea.Serializer::class)
public class InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea(
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

    public fun build(): InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea = InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea must be a JSON object")
      return InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea(block: InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea.Builder.() -> Unit): InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea = InlineV1AccountsExternalAcd662PostRequestFormBankAccountOwnership2a7eX701c65ea.build(block)
