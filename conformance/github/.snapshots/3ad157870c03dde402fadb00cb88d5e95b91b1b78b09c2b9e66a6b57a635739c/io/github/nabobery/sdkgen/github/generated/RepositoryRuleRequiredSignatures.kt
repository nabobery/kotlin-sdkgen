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
 * Commits pushed to matching refs must have verified signatures.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-required-signatures
 */
@Serializable(with = RepositoryRuleRequiredSignatures.Serializer::class)
public class RepositoryRuleRequiredSignatures(
  public val type: InlineRepositoryRuleRequiredSignaturesTypeX8a300d44,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleRequiredSignaturesTypeX8a300d44? = null

    public var type: InlineRepositoryRuleRequiredSignaturesTypeX8a300d44
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RepositoryRuleRequiredSignatures {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleRequiredSignatures(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleRequiredSignatures = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleRequiredSignatures> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleRequiredSignatures {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleRequiredSignatures")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleRequiredSignatures must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleRequiredSignaturesTypeX8a300d44>(rawObject, "type")
      return RepositoryRuleRequiredSignatures(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleRequiredSignatures) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleRequiredSignatures")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleRequiredSignatures(block: RepositoryRuleRequiredSignatures.Builder.() -> Unit): RepositoryRuleRequiredSignatures = RepositoryRuleRequiredSignatures.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleRequiredSignatures is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
