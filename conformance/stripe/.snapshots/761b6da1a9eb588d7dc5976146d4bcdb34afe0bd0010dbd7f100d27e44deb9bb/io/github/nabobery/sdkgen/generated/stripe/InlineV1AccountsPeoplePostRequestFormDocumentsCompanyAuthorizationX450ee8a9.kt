package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/company_authorization.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/company_authorization
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9(
  files: List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953>? = null,
) {
  public val files:
      List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953>? =
      files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953>? =
        null

    public var files:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9 = InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9 must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationItemXde70d953>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9(block: InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9 = InlineV1AccountsPeoplePostRequestFormDocumentsCompanyAuthorizationX450ee8a9.build(block)
