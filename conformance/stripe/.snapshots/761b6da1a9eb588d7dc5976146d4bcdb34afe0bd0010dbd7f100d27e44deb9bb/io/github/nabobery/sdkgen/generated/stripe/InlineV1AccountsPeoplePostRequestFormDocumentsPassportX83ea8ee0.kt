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
 * 1x-www-form-urlencoded/schema/properties/documents/properties/passport.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/passport
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0(
  files: List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31>? = null,
) {
  public val files: List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31>?
      = files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31>? = null

    public var files:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0 = InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0 must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemX4549fd31>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0(block: InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0 = InlineV1AccountsPeoplePostRequestFormDocumentsPassportX83ea8ee0.build(block)
