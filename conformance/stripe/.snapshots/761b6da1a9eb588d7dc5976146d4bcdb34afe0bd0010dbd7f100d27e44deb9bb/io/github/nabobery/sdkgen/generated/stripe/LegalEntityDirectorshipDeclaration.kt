package io.github.nabobery.sdkgen.generated.stripe

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
public data class LegalEntityDirectorshipDeclarationView(
  public val date: Int? = null,
  public val ip: String? = null,
  @SerialName("user_agent")
  public val userAgent: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_directorship_declaration
 */
@Serializable(with = LegalEntityDirectorshipDeclaration.Serializer::class)
public class LegalEntityDirectorshipDeclaration(
  /**
   * The Unix timestamp marking when the directorship declaration attestation was made.
   */
  public val date: Int? = null,
  /**
   * The IP address from which the directorship declaration attestation was made.
   */
  public val ip: String? = null,
  /**
   * The user-agent string from the browser where the directorship declaration attestation was made.
   */
  public val userAgent: String? = null,
) {
  public class Builder {
    /**
     * The Unix timestamp marking when the directorship declaration attestation was made.
     */
    public var date: Int? = null

    /**
     * The IP address from which the directorship declaration attestation was made.
     */
    public var ip: String? = null

    /**
     * The user-agent string from the browser where the directorship declaration attestation was made.
     */
    public var userAgent: String? = null

    public fun build(): LegalEntityDirectorshipDeclaration = LegalEntityDirectorshipDeclaration(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityDirectorshipDeclaration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LegalEntityDirectorshipDeclaration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityDirectorshipDeclaration {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityDirectorshipDeclaration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityDirectorshipDeclaration must be a JSON object")
      return LegalEntityDirectorshipDeclaration(
        date = rawObject["date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        ip = rawObject["ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        userAgent = rawObject["user_agent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityDirectorshipDeclaration) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityDirectorshipDeclaration")
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

public fun legalEntityDirectorshipDeclaration(block: LegalEntityDirectorshipDeclaration.Builder.() -> Unit): LegalEntityDirectorshipDeclaration = LegalEntityDirectorshipDeclaration.build(block)
