package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/company_authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/company_authorization
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912(
  files: List<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35>? = null,
) {
  public val files:
      List<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35>? =
      files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35>? =
        null

    public var files:
        List<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912 = InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912 must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationItemX6b63cf35>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912(block: InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912 = InlineV1AccountsPersonsPostRequestFormDocumentsCompanyAuthorizationX4117d912.build(block)
