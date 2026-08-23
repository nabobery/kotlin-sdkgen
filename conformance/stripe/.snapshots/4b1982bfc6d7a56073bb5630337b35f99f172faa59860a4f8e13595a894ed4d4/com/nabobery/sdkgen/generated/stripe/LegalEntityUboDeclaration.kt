package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class LegalEntityUboDeclarationView(
  public val date: Int? = null,
  public val ip: String? = null,
  @SerialName("user_agent")
  public val userAgent: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_ubo_declaration
 */
@Serializable(with = LegalEntityUboDeclaration.Serializer::class)
public class LegalEntityUboDeclaration(
  /**
   * The Unix timestamp marking when the beneficial owner attestation was made.
   */
  public val date: Int? = null,
  /**
   * The IP address from which the beneficial owner attestation was made.
   */
  public val ip: String? = null,
  /**
   * The user-agent string from the browser where the beneficial owner attestation was made.
   */
  public val userAgent: String? = null,
) {
  public class Builder {
    /**
     * The Unix timestamp marking when the beneficial owner attestation was made.
     */
    public var date: Int? = null

    /**
     * The IP address from which the beneficial owner attestation was made.
     */
    public var ip: String? = null

    /**
     * The user-agent string from the browser where the beneficial owner attestation was made.
     */
    public var userAgent: String? = null

    public fun build(): LegalEntityUboDeclaration = LegalEntityUboDeclaration(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityUboDeclaration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LegalEntityUboDeclaration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityUboDeclaration {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityUboDeclaration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityUboDeclaration must be a JSON object")
      return LegalEntityUboDeclaration(
        date = rawObject["date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        ip = rawObject["ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        userAgent = rawObject["user_agent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityUboDeclaration) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityUboDeclaration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", json.encodeToJsonElement(it)) }
        value.ip?.let { put("ip", it) }
        value.userAgent?.let { put("user_agent", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun legalEntityUboDeclaration(block: LegalEntityUboDeclaration.Builder.() -> Unit): LegalEntityUboDeclaration = LegalEntityUboDeclaration.build(block)
