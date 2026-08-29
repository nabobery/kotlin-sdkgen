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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/company_authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/company_authorization
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f.Serializer::class)
public class InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f(
  files: List<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31>? = null,
) {
  public val files:
      List<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31>? =
      files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31>? = null

    public var files:
        List<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f = InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f must be a JSON object")
      return InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationItemX2edc7f31>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f(block: InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f = InlineV1TokensPostRequestFormPersonDocumentsCompanyAuthorizationXd52e902f.build(block)
