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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema/oneOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema/oneOf/2
 */
@Serializable(with = InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651.Serializer::class)
public class InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651(
  /**
   * The field's data type.
   */
  public val dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741,
  public val iterationConfiguration: ProjectsV2FieldIterationConfiguration,
  /**
   * The name of the field.
   */
  public val name: String,
) {
  public class Builder {
    private var dataTypeValue: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741? =
        null

    public var dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741
      get() = requireNotNull(dataTypeValue) { "dataType is required" }
      set(`value`) {
        dataTypeValue = value
      }

    private var iterationConfigurationValue: ProjectsV2FieldIterationConfiguration? = null

    public var iterationConfiguration: ProjectsV2FieldIterationConfiguration
      get() = requireNotNull(iterationConfigurationValue) { "iterationConfiguration is required" }
      set(`value`) {
        iterationConfigurationValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 {
      check(dataTypeValue != null) { "dataType is required" }
      check(iterationConfigurationValue != null) { "iterationConfiguration is required" }
      check(nameValue != null) { "name is required" }
      return InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651(
        dataType = dataType,
        iterationConfiguration = iterationConfiguration,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 must be a JSON object")
      val dataType = json.decodeRequired<InlineUsersProjectsV2FieldsPostRequestJsonOneOf3DataTypeXbce44741>(rawObject, "data_type")
      val iterationConfiguration = json.decodeRequired<ProjectsV2FieldIterationConfiguration>(rawObject, "iteration_configuration")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651(
        dataType = dataType,
        iterationConfiguration = iterationConfiguration,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("iteration_configuration", json.encodeToJsonElement(value.iterationConfiguration))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651(block: InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651.Builder.() -> Unit): InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 = InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf3Xf2916651 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
