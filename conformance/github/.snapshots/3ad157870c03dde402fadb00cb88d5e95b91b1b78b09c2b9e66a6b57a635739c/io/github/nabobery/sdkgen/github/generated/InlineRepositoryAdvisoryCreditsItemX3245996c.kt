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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/credits/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/credits/items
 */
@Serializable(with = InlineRepositoryAdvisoryCreditsItemX3245996c.Serializer::class)
public class InlineRepositoryAdvisoryCreditsItemX3245996c(
  /**
   * The username of the user credited.
   */
  public val login: String? = null,
  public val type: SecurityAdvisoryCreditTypes? = null,
) {
  public class Builder {
    /**
     * The username of the user credited.
     */
    public var login: String? = null

    public var type: SecurityAdvisoryCreditTypes? = null

    public fun build(): InlineRepositoryAdvisoryCreditsItemX3245996c = InlineRepositoryAdvisoryCreditsItemX3245996c(
      login = login,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryCreditsItemX3245996c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryCreditsItemX3245996c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryCreditsItemX3245996c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryCreditsItemX3245996c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryCreditsItemX3245996c must be a JSON object")
      return InlineRepositoryAdvisoryCreditsItemX3245996c(
        login = rawObject["login"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<SecurityAdvisoryCreditTypes>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryCreditsItemX3245996c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryCreditsItemX3245996c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.login?.let { put("login", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryCreditsItemX3245996c(block: InlineRepositoryAdvisoryCreditsItemX3245996c.Builder.() -> Unit): InlineRepositoryAdvisoryCreditsItemX3245996c = InlineRepositoryAdvisoryCreditsItemX3245996c.build(block)
