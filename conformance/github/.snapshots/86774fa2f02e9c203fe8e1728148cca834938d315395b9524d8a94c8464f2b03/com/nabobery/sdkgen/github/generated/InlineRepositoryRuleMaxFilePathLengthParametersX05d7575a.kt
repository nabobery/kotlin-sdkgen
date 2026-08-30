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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-path-length/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-path-length/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a.Serializer::class)
public class InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a(
  /**
   * The maximum amount of characters allowed in file paths.
   */
  public val maxFilePathLength: Int,
) {
  public class Builder {
    private var maxFilePathLengthValue: Int? = null

    public var maxFilePathLength: Int
      get() = requireNotNull(maxFilePathLengthValue) { "maxFilePathLength is required" }
      set(`value`) {
        maxFilePathLengthValue = value
      }

    public fun build(): InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a {
      check(maxFilePathLengthValue != null) { "maxFilePathLength is required" }
      return InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a(
        maxFilePathLength = maxFilePathLength,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a must be a JSON object")
      val maxFilePathLength = json.decodeRequired<Int>(rawObject, "max_file_path_length")
      return InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a(
        maxFilePathLength = maxFilePathLength,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("max_file_path_length", json.encodeToJsonElement(value.maxFilePathLength))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleMaxFilePathLengthParametersX05d7575a(block: InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a.Builder.() -> Unit): InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a = InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleMaxFilePathLengthParametersX05d7575a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
