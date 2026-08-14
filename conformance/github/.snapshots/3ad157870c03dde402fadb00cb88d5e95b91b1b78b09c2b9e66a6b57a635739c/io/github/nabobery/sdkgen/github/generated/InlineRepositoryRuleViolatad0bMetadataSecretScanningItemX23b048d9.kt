package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-violation-error/properties/metadata/properties/secre
 * t_scanning/properties/bypass_placeholders/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-violation-error/properties/metadata/properties/secre
 * t_scanning/properties/bypass_placeholders/items
 */
@Serializable(with = InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9.Serializer::class)
public class InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9(
  public val placeholderId: String? = null,
  public val tokenType: String? = null,
) {
  public class Builder {
    public var placeholderId: String? = null

    public var tokenType: String? = null

    public fun build(): InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9 = InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9(
      placeholderId = placeholderId,
      tokenType = tokenType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9 must be a JSON object")
      return InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9(
        placeholderId = rawObject["placeholder_id"]?.let { json.decodeFromJsonElement<String>(it) },
        tokenType = rawObject["token_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.placeholderId?.let { put("placeholder_id", it) }
        value.tokenType?.let { put("token_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9(block: InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9.Builder.() -> Unit): InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9 = InlineRepositoryRuleViolatad0bMetadataSecretScanningItemX23b048d9.build(block)
