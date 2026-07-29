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
public data class LegalEntityRepresentativeDeclarationView(
  public val date: Int? = null,
  public val ip: String? = null,
  @SerialName("user_agent")
  public val userAgent: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_representative_declaration
 */
@Serializable(with = LegalEntityRepresentativeDeclaration.Serializer::class)
public class LegalEntityRepresentativeDeclaration(
  /**
   * The Unix timestamp marking when the representative declaration attestation was made.
   */
  public val date: Int? = null,
  /**
   * The IP address from which the representative declaration attestation was made.
   */
  public val ip: String? = null,
  /**
   * The user-agent string from the browser where the representative declaration attestation was made.
   */
  public val userAgent: String? = null,
) {
  public class Builder {
    /**
     * The Unix timestamp marking when the representative declaration attestation was made.
     */
    public var date: Int? = null

    /**
     * The IP address from which the representative declaration attestation was made.
     */
    public var ip: String? = null

    /**
     * The user-agent string from the browser where the representative declaration attestation was made.
     */
    public var userAgent: String? = null

    public fun build(): LegalEntityRepresentativeDeclaration = LegalEntityRepresentativeDeclaration(
      date = date,
      ip = ip,
      userAgent = userAgent,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityRepresentativeDeclaration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<LegalEntityRepresentativeDeclaration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityRepresentativeDeclaration {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityRepresentativeDeclaration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityRepresentativeDeclaration must be a JSON object")
      return LegalEntityRepresentativeDeclaration(
        date = rawObject["date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        ip = rawObject["ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        userAgent = rawObject["user_agent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityRepresentativeDeclaration) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityRepresentativeDeclaration")
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

public fun legalEntityRepresentativeDeclaration(block: LegalEntityRepresentativeDeclaration.Builder.() -> Unit): LegalEntityRepresentativeDeclaration = LegalEntityRepresentativeDeclaration.build(block)
