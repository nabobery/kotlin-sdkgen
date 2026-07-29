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
 * rm-urlencoded/schema/properties/documents/properties/visa.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/visa
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c(
  files: List<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0>? = null,
) {
  public val files: List<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0>? =
      files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue:
        List<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0>? = null

    public var files: List<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c = InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c(
      files = files,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemX9b1fb9b0>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c(block: InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c = InlineV1AccountsPersonsPostRequestFormDocumentsVisaX2fb8b73c.build(block)
