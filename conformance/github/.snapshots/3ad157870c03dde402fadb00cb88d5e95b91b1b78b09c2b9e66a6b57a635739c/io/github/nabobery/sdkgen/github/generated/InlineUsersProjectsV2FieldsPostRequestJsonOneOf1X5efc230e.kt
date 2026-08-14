package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema/oneOf/0
 */
@Serializable(with = InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e.Serializer::class)
public class InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e(
  /**
   * The field's data type.
   */
  public val dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9,
  /**
   * The name of the field.
   */
  public val name: String,
) {
  public class Builder {
    private var dataTypeValue: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9? =
        null

    public var dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9
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

    public fun build(): InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e {
      check(dataTypeValue != null) { "dataType is required" }
      check(nameValue != null) { "name is required" }
      return InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e(
        dataType = dataType,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e must be a JSON object")
      val dataType = json.decodeRequired<InlineUsersProjectsV2FieldsPostRequestJsonOneOf1DataTypeX8260e3c9>(rawObject, "data_type")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e(
        dataType = dataType,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e(block: InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e.Builder.() -> Unit): InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e = InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf1X5efc230e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
