package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1properties~1schema/patch/requestBody/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1properties~1schema/patch/requestBody/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b.Serializer::class)
public class InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b(
  properties: List<CustomProperty>,
) {
  /**
   * The array of custom properties to create or update.
   */
  public val properties: List<CustomProperty> = properties.toList()

  public class Builder {
    private var propertiesValue: List<CustomProperty>? = null

    public var properties: List<CustomProperty>
      get() = requireNotNull(propertiesValue) { "properties is required" }
      set(`value`) {
        propertiesValue = value
      }

    public fun build(): InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b {
      check(propertiesValue != null) { "properties is required" }
      return InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b(
        properties = properties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b must be a JSON object")
      val properties = json.decodeRequired<List<CustomProperty>>(rawObject, "properties")
      return InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b(
        properties = properties,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("properties", json.encodeToJsonElement(value.properties))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b(block: InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b.Builder.() -> Unit): InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b = InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsPropertiesSchemaPatchRequestJsonX8deb606b property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
