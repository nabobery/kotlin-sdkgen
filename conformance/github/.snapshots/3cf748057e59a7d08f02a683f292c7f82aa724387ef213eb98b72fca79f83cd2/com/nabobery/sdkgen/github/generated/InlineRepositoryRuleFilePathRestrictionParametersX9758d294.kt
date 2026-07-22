package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-path-restriction/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-path-restriction/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleFilePathRestrictionParametersX9758d294.Serializer::class)
public class InlineRepositoryRuleFilePathRestrictionParametersX9758d294(
  restrictedFilePaths: List<String>,
) {
  /**
   * The file paths that are restricted from being pushed to the commit graph.
   */
  public val restrictedFilePaths: List<String> = restrictedFilePaths.toList()

  public class Builder {
    private var restrictedFilePathsValue: List<String>? = null

    public var restrictedFilePaths: List<String>
      get() = requireNotNull(restrictedFilePathsValue) { "restrictedFilePaths is required" }
      set(`value`) {
        restrictedFilePathsValue = value
      }

    public fun build(): InlineRepositoryRuleFilePathRestrictionParametersX9758d294 {
      check(restrictedFilePathsValue != null) { "restrictedFilePaths is required" }
      return InlineRepositoryRuleFilePathRestrictionParametersX9758d294(
        restrictedFilePaths = restrictedFilePaths,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleFilePathRestrictionParametersX9758d294 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRuleFilePathRestrictionParametersX9758d294> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleFilePathRestrictionParametersX9758d294 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleFilePathRestrictionParametersX9758d294")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleFilePathRestrictionParametersX9758d294 must be a JSON object")
      val restrictedFilePaths = json.decodeRequired<List<String>>(rawObject, "restricted_file_paths")
      return InlineRepositoryRuleFilePathRestrictionParametersX9758d294(
        restrictedFilePaths = restrictedFilePaths,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleFilePathRestrictionParametersX9758d294) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleFilePathRestrictionParametersX9758d294")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("restricted_file_paths", json.encodeToJsonElement(value.restrictedFilePaths))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleFilePathRestrictionParametersX9758d294(block: InlineRepositoryRuleFilePathRestrictionParametersX9758d294.Builder.() -> Unit): InlineRepositoryRuleFilePathRestrictionParametersX9758d294 = InlineRepositoryRuleFilePathRestrictionParametersX9758d294.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleFilePathRestrictionParametersX9758d294 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
