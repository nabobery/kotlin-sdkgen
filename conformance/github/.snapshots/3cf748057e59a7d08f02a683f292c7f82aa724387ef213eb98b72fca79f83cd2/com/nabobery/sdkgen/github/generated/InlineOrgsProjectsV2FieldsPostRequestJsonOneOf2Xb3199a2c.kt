package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/1
 */
@Serializable(with = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c.Serializer::class)
public class InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c(
  /**
   * The field's data type.
   */
  public val dataType: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd,
  /**
   * The name of the field.
   */
  public val name: String,
) {
  public class Builder {
    private var dataTypeValue: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd? =
        null

    public var dataType: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd
      get() = requireNotNull(dataTypeValue) { "dataType is required" }
      set(`value`) {
        dataTypeValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c {
      check(dataTypeValue != null) { "dataType is required" }
      check(nameValue != null) { "name is required" }
      return InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c(
        dataType = dataType,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c must be a JSON object")
      val dataType = json.decodeRequired<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2DataTypeXbc7f0bfd>(rawObject, "data_type")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c(
        dataType = dataType,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c(block: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c.Builder.() -> Unit): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf2Xb3199a2c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
