package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/validation-error/properties/errors/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/validation-error/properties/errors/items
 */
@Serializable(with = InlineValidationErrorErrorsItemX68da37f1.Serializer::class)
public class InlineValidationErrorErrorsItemX68da37f1(
  public val code: String,
  public val `field`: String? = null,
  public val index: Int? = null,
  public val message: String? = null,
  public val resource: String? = null,
  public val `value`: InlineValidationErrorErrorsItemValueXfbfbd72c? = null,
) {
  public class Builder {
    private var codeValue: String? = null

    public var code: String
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    public var `field`: String? = null

    public var index: Int? = null

    public var message: String? = null

    public var resource: String? = null

    public var `value`: InlineValidationErrorErrorsItemValueXfbfbd72c? = null

    public fun build(): InlineValidationErrorErrorsItemX68da37f1 {
      check(codeValue != null) { "code is required" }
      return InlineValidationErrorErrorsItemX68da37f1(
        code = code,
        field = field,
        index = index,
        message = message,
        resource = resource,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineValidationErrorErrorsItemX68da37f1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineValidationErrorErrorsItemX68da37f1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineValidationErrorErrorsItemX68da37f1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineValidationErrorErrorsItemX68da37f1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineValidationErrorErrorsItemX68da37f1 must be a JSON object")
      val code = json.decodeRequired<String>(rawObject, "code")
      return InlineValidationErrorErrorsItemX68da37f1(
        code = code,
        field = rawObject["field"]?.let { json.decodeFromJsonElement<String>(it) },
        index = rawObject["index"]?.let { json.decodeFromJsonElement<Int>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        resource = rawObject["resource"]?.let { json.decodeFromJsonElement<String>(it) },
        value = rawObject["value"]?.let { json.decodeFromJsonElement<InlineValidationErrorErrorsItemValueXfbfbd72c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineValidationErrorErrorsItemX68da37f1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineValidationErrorErrorsItemX68da37f1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", value.code)
        value.field?.let { put("field", it) }
        value.index?.let { put("index", json.encodeToJsonElement(it)) }
        value.message?.let { put("message", it) }
        value.resource?.let { put("resource", it) }
        value.value?.let { put("value", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineValidationErrorErrorsItemX68da37f1(block: InlineValidationErrorErrorsItemX68da37f1.Builder.() -> Unit): InlineValidationErrorErrorsItemX68da37f1 = InlineValidationErrorErrorsItemX68da37f1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineValidationErrorErrorsItemX68da37f1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
