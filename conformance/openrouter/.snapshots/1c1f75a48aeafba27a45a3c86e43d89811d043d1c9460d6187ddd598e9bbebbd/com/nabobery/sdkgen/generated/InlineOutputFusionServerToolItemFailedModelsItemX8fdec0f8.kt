package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem/properties/failed_models/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem/properties/failed_models/items
 */
@Serializable(with = InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8.Serializer::class)
public class InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8(
  /**
   * Error message describing why the model failed.
   */
  public val error: String,
  /**
   * Slug of the analysis model that failed.
   */
  public val model: String,
  /**
   * HTTP status code from the upstream response, when available (e.g. 402, 429).
   */
  public val statusCode: Int? = null,
) {
  public class Builder {
    private var errorValue: String? = null

    public var error: String
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    /**
     * HTTP status code from the upstream response, when available (e.g. 402, 429).
     */
    public var statusCode: Int? = null

    public fun build(): InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8 {
      check(errorValue != null) { "error is required" }
      check(modelValue != null) { "model is required" }
      return InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8(
        error = error,
        model = model,
        statusCode = statusCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8 must be a JSON object")
      val error = json.decodeRequired<String>(rawObject, "error")
      val model = json.decodeRequired<String>(rawObject, "model")
      return InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8(
        error = error,
        model = model,
        statusCode = rawObject["status_code"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error", value.error)
        put("model", value.model)
        value.statusCode?.let { put("status_code", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8(block: InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8.Builder.() -> Unit): InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8 = InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputFusionServerToolItemFailedModelsItemX8fdec0f8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
