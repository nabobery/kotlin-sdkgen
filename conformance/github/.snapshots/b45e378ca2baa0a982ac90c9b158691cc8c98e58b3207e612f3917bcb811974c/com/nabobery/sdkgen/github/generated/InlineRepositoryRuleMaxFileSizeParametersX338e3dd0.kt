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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-size/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-max-file-size/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleMaxFileSizeParametersX338e3dd0.Serializer::class)
public class InlineRepositoryRuleMaxFileSizeParametersX338e3dd0(
  /**
   * The maximum file size allowed in megabytes. This limit does not apply to Git Large File Storage (Git LFS).
   */
  public val maxFileSize: Int,
) {
  public class Builder {
    private var maxFileSizeValue: Int? = null

    public var maxFileSize: Int
      get() = requireNotNull(maxFileSizeValue) { "maxFileSize is required" }
      set(`value`) {
        maxFileSizeValue = value
      }

    public fun build(): InlineRepositoryRuleMaxFileSizeParametersX338e3dd0 {
      check(maxFileSizeValue != null) { "maxFileSize is required" }
      return InlineRepositoryRuleMaxFileSizeParametersX338e3dd0(
        maxFileSize = maxFileSize,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleMaxFileSizeParametersX338e3dd0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleMaxFileSizeParametersX338e3dd0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleMaxFileSizeParametersX338e3dd0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleMaxFileSizeParametersX338e3dd0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleMaxFileSizeParametersX338e3dd0 must be a JSON object")
      val maxFileSize = json.decodeRequired<Int>(rawObject, "max_file_size")
      return InlineRepositoryRuleMaxFileSizeParametersX338e3dd0(
        maxFileSize = maxFileSize,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleMaxFileSizeParametersX338e3dd0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleMaxFileSizeParametersX338e3dd0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("max_file_size", json.encodeToJsonElement(value.maxFileSize))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleMaxFileSizeParametersX338e3dd0(block: InlineRepositoryRuleMaxFileSizeParametersX338e3dd0.Builder.() -> Unit): InlineRepositoryRuleMaxFileSizeParametersX338e3dd0 = InlineRepositoryRuleMaxFileSizeParametersX338e3dd0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleMaxFileSizeParametersX338e3dd0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
