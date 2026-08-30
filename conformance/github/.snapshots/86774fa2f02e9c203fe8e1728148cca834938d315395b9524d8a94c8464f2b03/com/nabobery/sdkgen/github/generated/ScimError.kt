package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Scim Error
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/scim-error
 */
@Serializable(with = ScimError.Serializer::class)
public class ScimError(
  public val detail: String? = null,
  public val documentationUrl: String? = null,
  public val message: String? = null,
  schemas: List<String>? = null,
  public val scimType: String? = null,
  public val status: Int? = null,
) {
  public val schemas: List<String>? = schemas?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var detail: String? = null

    public var documentationUrl: String? = null

    public var message: String? = null

    private var schemasValue: List<String>? = null

    public var schemas: List<String>?
      get() = schemasValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        schemasValue = value?.let { collection0 -> collection0.toList() }
      }

    public var scimType: String? = null

    public var status: Int? = null

    public fun build(): ScimError = ScimError(
      detail = detail,
      documentationUrl = documentationUrl,
      message = message,
      schemas = schemas,
      scimType = scimType,
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ScimError = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ScimError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ScimError {
      val jsonDecoder = decoder.requireJsonDecoder("ScimError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ScimError must be a JSON object")
      return ScimError(
        detail = rawObject["detail"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        documentationUrl = rawObject["documentation_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        message = rawObject["message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        schemas = rawObject["schemas"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        scimType = rawObject["scimType"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ScimError) {
      val jsonEncoder = encoder.requireJsonEncoder("ScimError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.detail?.let { put("detail", it) }
        value.documentationUrl?.let { put("documentation_url", it) }
        value.message?.let { put("message", it) }
        value.schemas?.let { put("schemas", json.encodeToJsonElement(it)) }
        value.scimType?.let { put("scimType", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun scimError(block: ScimError.Builder.() -> Unit): ScimError = ScimError.build(block)
