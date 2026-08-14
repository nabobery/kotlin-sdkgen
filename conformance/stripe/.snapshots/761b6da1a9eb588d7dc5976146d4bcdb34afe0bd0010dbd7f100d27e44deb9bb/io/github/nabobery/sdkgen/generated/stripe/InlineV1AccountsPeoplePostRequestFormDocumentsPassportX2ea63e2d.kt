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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/passport.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/passport
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d(
  files: List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7>? = null,
) {
  public val files: List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7>?
      = files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7>? = null

    public var files:
        List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d = InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemXea4b3fc7>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d(block: InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d = InlineV1AccountsPeoplePostRequestFormDocumentsPassportX2ea63e2d.build(block)
