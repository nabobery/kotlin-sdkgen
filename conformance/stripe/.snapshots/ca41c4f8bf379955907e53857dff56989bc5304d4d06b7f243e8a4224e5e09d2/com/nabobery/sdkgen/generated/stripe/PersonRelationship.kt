package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_relationship
 */
@Serializable(with = PersonRelationship.Serializer::class)
public class PersonRelationship(
  /**
   * Whether the person is the authorizer of the account's representative.
   */
  public val authorizer: Boolean? = null,
  /**
   * Whether the person is a director of the account's legal entity. Directors are typically members of the governing
   * board of the company, or responsible for ensuring the company meets its regulatory obligations.
   */
  public val director: Boolean? = null,
  /**
   * Whether the person has significant responsibility to control, manage, or direct the organization.
   */
  public val executive: Boolean? = null,
  /**
   * Whether the person is the legal guardian of the account's representative.
   */
  public val legalGuardian: Boolean? = null,
  /**
   * Whether the person is an owner of the account’s legal entity.
   */
  public val owner: Boolean? = null,
  /**
   * The percent owned by the person of the account's legal entity.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val percentOwnership: Double? = null,
  /**
   * Whether the person is authorized as the primary representative of the account. This is the person nominated by the
   * business to provide information about themselves, and general information about the account. There can only be one
   * representative at any given time. At the time the account is created, this person should be set to the person
   * responsible for opening the account.
   */
  public val representative: Boolean? = null,
  /**
   * The person's title (e.g., CEO, Support Engineer).
   */
  public val title: String? = null,
) {
  public class Builder {
    /**
     * Whether the person is the authorizer of the account's representative.
     */
    public var authorizer: Boolean? = null

    /**
     * Whether the person is a director of the account's legal entity. Directors are typically members of the governing
     * board of the company, or responsible for ensuring the company meets its regulatory obligations.
     */
    public var director: Boolean? = null

    /**
     * Whether the person has significant responsibility to control, manage, or direct the organization.
     */
    public var executive: Boolean? = null

    /**
     * Whether the person is the legal guardian of the account's representative.
     */
    public var legalGuardian: Boolean? = null

    /**
     * Whether the person is an owner of the account’s legal entity.
     */
    public var owner: Boolean? = null

    /**
     * The percent owned by the person of the account's legal entity.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var percentOwnership: Double? = null

    /**
     * Whether the person is authorized as the primary representative of the account. This is the person nominated by
     * the business to provide information about themselves, and general information about the account. There can only
     * be one representative at any given time. At the time the account is created, this person should be set to the
     * person responsible for opening the account.
     */
    public var representative: Boolean? = null

    /**
     * The person's title (e.g., CEO, Support Engineer).
     */
    public var title: String? = null

    public fun build(): PersonRelationship = PersonRelationship(
      authorizer = authorizer,
      director = director,
      executive = executive,
      legalGuardian = legalGuardian,
      owner = owner,
      percentOwnership = percentOwnership,
      representative = representative,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PersonRelationship = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PersonRelationship> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PersonRelationship {
      val jsonDecoder = decoder.requireJsonDecoder("PersonRelationship")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PersonRelationship must be a JSON object")
      return PersonRelationship(
        authorizer = rawObject["authorizer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        director = rawObject["director"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        executive = rawObject["executive"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        legalGuardian = rawObject["legal_guardian"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        owner = rawObject["owner"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        percentOwnership = rawObject["percent_ownership"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        representative = rawObject["representative"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        title = rawObject["title"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PersonRelationship) {
      val jsonEncoder = encoder.requireJsonEncoder("PersonRelationship")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.authorizer?.let { put("authorizer", json.encodeToJsonElement(it)) }
        value.director?.let { put("director", json.encodeToJsonElement(it)) }
        value.executive?.let { put("executive", json.encodeToJsonElement(it)) }
        value.legalGuardian?.let { put("legal_guardian", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.percentOwnership?.let { put("percent_ownership", json.encodeToJsonElement(it)) }
        value.representative?.let { put("representative", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun personRelationship(block: PersonRelationship.Builder.() -> Unit): PersonRelationship = PersonRelationship.build(block)
