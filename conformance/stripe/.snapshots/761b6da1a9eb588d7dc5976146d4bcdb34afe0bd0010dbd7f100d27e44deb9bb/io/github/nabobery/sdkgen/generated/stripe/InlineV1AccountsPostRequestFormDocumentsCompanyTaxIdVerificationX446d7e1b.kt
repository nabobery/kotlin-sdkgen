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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/company_tax_id_verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/company_tax_id_verification
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b(
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

    public fun build(): InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b = InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b must be a JSON object")
      return InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b(block: InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b.Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b = InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b.build(block)
