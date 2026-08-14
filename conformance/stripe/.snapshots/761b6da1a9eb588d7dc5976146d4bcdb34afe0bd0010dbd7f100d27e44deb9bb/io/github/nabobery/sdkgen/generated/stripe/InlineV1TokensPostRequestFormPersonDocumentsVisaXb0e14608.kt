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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/visa.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/documents/properties/visa
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608.Serializer::class)
public class InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608(
  files: List<InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemX75e93391>? = null,
) {
  public val files: List<InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemX75e93391>? =
      files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemX75e93391>? = null

    public var files: List<InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemX75e93391>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608 = InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608 must be a JSON object")
      return InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1TokensPostRequestFormPersonDocumentsVisaFilesItemX75e93391>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608(block: InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608 = InlineV1TokensPostRequestFormPersonDocumentsVisaXb0e14608.build(block)
