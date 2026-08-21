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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/visa.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/visa
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109(
  files: List<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemXf9835fe6>? = null,
) {
  public val files: List<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemXf9835fe6>? =
      files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemXf9835fe6>? = null

    public var files: List<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemXf9835fe6>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109 = InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109 must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemXf9835fe6>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109(block: InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109 = InlineV1AccountsPeoplePostRequestFormDocumentsVisaXd7a11109.build(block)
