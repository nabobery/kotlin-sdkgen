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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/company_authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/company_authorization
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e(
  files: List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919>? = null,
) {
  public val files:
      List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919>? =
      files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919>? =
        null

    public var files:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e = InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXa7aea919>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e(block: InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e = InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX5c920d3e.build(block)
