package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-extension-restriction/properties/parameters.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-file-extension-restriction/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6.Serializer::class)
public class InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6(
  restrictedFileExtensions: List<String>,
) {
  /**
   * The file extensions that are restricted from being pushed to the commit graph.
   */
  public val restrictedFileExtensions: List<String> = restrictedFileExtensions.toList()

  public class Builder {
    private var restrictedFileExtensionsValue: List<String>? = null

    public var restrictedFileExtensions: List<String>
      get() = requireNotNull(restrictedFileExtensionsValue) { "restrictedFileExtensions is required" }.toList()
      set(`value`) {
        restrictedFileExtensionsValue = value.toList()
      }

    public fun build(): InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6 {
      check(restrictedFileExtensionsValue != null) { "restrictedFileExtensions is required" }
      return InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6(
        restrictedFileExtensions = restrictedFileExtensions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6 must be a JSON object")
      val restrictedFileExtensions = json.decodeRequired<List<String>>(rawObject, "restricted_file_extensions")
      return InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6(
        restrictedFileExtensions = restrictedFileExtensions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("restricted_file_extensions", json.encodeToJsonElement(value.restrictedFileExtensions))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6(block: InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6.Builder.() -> Unit): InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6 = InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleFileExtensionRestrictionParametersXaa21c0a6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
